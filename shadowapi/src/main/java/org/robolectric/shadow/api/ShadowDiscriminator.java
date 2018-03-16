package org.robolectric.shadow.api;

public interface ShadowDiscriminator<T> {
  T newInstance();
}
