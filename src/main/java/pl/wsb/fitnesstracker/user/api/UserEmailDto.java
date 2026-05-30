package pl.wsb.fitnesstracker.user.api;

import jakarta.annotation.Nullable;

/**
 * Data transfer object exposing only the identifier and the e-mail address
 * of a {@link User}. Used by the e-mail search endpoint, which returns matching
 * users without revealing any other personal data.
 *
 * @param id    the unique identifier of the user (may be {@code null} before persistence)
 * @param email the e-mail address of the user
 */
public record UserEmailDto(@Nullable Long id, String email) {

}
