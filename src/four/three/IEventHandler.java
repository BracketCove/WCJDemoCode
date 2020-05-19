package four.three;

/**
 * You can pick just about any name for a Generic Type,
 * but try to pick one which does not conflict with names
 * that are already defined in the project or project libraries.
 * We usually just use single capital letters such as:
 * - T for Type
 * - E for Event
 * etc...
 * @param <T>
 */
public interface IEventHandler<T> {
    //abstract method
    public void handle(T event);
}
