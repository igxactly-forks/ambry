package com.github.ambry.router;

/**
 * RouterFactory is a factory to generate all the supporting cast required to instantiate a {@link Router}.
 * <p/>
 * Usually called with the canonical class name and as such might have to support appropriate (multiple) constructors.
 */
public interface RouterFactory {
  /**
   * Returns a new instance of the {@link Router} that the factory generates.
   * @return an instance of {@link Router} generated by this factory.
   * @throws InstantiationException if the {@link Router} instance cannot be created.
   */
  public Router getRouter()
      throws InstantiationException;
}
