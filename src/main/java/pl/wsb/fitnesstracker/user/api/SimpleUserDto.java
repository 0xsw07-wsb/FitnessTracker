package pl.wsb.fitnesstracker.user.api;

import jakarta.annotation.Nullable;

/**
 * Simplified data transfer object exposing only the basic, non-sensitive
 * information about a {@link User}: identifier together with first and last name.
 * Used by endpoints that list users without revealing their full details.
 *
 * @param id        the unique identifier of the user (may be {@code null} before persistence)
 * @param firstName the first name of the user
 * @param lastName  the last name of the user
 */
public record SimpleUserDto(@Nullable Long id, String firstName, String lastName) {

}
