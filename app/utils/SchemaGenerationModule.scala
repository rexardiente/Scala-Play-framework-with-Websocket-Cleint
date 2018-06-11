package utils

class SchemaGenerationModule extends com.google.inject.AbstractModule {
  protected def configure() = {
    bind(classOf[utils.SchemaGenerator]).asEagerSingleton()
  }
}
