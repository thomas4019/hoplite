package com.sksamuel.hoplite.report

import com.sksamuel.hoplite.decoder.DotPath

/**
 * Implementations can choose how to obfuscate values.
 */
interface Obfuscator {
  fun obfuscate(path: DotPath, value: String): String
}

/**
 * An [Obfuscator] that returns the first three characters only of every field.
 */
object DefaultObfuscator : Obfuscator {
  override fun obfuscate(path: DotPath, value: String): String = value.take(3) + "*****"
}