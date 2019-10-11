package io.sentry;

import io.sentry.protocol.SentryId;

class NoOpHub implements IHub {

  private static final NoOpHub instance = new NoOpHub();

  private NoOpHub() {}

  public static NoOpHub getInstance() {
    return instance;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }

  @Override
  public SentryId captureEvent(SentryEvent event) {
    return SentryId.EMPTY_ID;
  }

  @Override
  public SentryId captureMessage(String message) {
    return SentryId.EMPTY_ID;
  }

  @Override
  public SentryId captureException(Throwable throwable) {
    return SentryId.EMPTY_ID;
  }

  @Override
  public void close() {}

  @Override
  public void addBreadcrumb(Breadcrumb breadcrumb) {}

  @Override
  public SentryId getLastEventId() {
    return SentryId.EMPTY_ID;
  }

  @Override
  public void pushScope() {}

  @Override
  public void popScope() {}

  @Override
  public void withScope(ScopeCallback callback) {}

  @Override
  public void configureScope(ScopeCallback callback) {}

  @Override
  public void bindClient(SentryClient client) {}

  @Override
  public void flush(long timeoutMills) {}

  @Override
  public IHub clone() {
    return instance;
  }
}