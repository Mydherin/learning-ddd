package local.mydherin.users.domain.shared;

public abstract class ValueObject {
    protected void ensureIsNotNull(final Object value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
    }
}
