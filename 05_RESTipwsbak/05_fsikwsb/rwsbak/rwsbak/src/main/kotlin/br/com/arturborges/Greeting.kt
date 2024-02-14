package br.com.arturborges

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy.Content
import kotlin.reflect.jvm.internal.impl.name.ClassId

class Greeting (val id: Long, val content: String)