package processor

import javax.annotation.processing.SupportedAnnotationTypes
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion

@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes("com.querydsl.core.annotations.*")
class QuerydslAnnotationProcessor : com.querydsl.apt.QuerydslAnnotationProcessor()