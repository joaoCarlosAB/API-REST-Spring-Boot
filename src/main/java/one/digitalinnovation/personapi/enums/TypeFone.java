package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeFone {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    TypeFone(String description) {
    }
}
