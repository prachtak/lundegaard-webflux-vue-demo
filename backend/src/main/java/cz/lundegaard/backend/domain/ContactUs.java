package cz.lundegaard.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "contact_form")
public class ContactUs {

    @Id
    private ObjectId id;

    @Indexed
    private String contactFormTypeCode;

    private String policyNumber;
    private String name;
    private String surname;
    private String requestMessage;
}
