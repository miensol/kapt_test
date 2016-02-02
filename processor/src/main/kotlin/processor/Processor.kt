package processor

import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion

@SupportedSourceVersion(SourceVersion.RELEASE_8)
class QuerydslAnnotationProcessor : com.querydsl.apt.QuerydslAnnotationProcessor()