package com.users.test.model.entity;

import com.users.test.enums.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * User Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="USERS")
@Builder
public class User {
    /**
     * Identifier of the entity
     */
    @Id
    private String id;

    /**
     * username (Unique and not empty or blank)
     */
    @NotBlank(message = "UserName should not be blank")
    @NotEmpty(message = "UserName should not be empty")
    @NotNull(message = "Username should not be null")
    private String username;

    /**
     * BirdthDate (Should not be null)
     */
    @NotNull(message = "Birth Date should not be null")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDate;

    /**
     * PhoneNumber
     */
    private String phoneNumber;

    /**
     * Gender
     */
    private Gender gender;

    /**
     * Country
     */
    @NotNull(message = "Country should not be null")
    private String country;

}
