/*
 * Copyright 2016 Stephen McIntosh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stephenmac7.furitsuki

import com.stephenmac7.jcore.UnidicImporter
import com.stephenmac7.jcore.furigana

import scala.io.StdIn

object Main {
  // invoke via `sbt "run -FLAGS"` (quotes important!)
  def main(args: Array[String]) = {
    furigana.dict // force evaluation of lazy variable
    var in = "";
    while (in != null) {
      in = StdIn.readLine()
      if (in != null) {
        val sentence = UnidicImporter.toSentence(in)
        println(furigana.fromSentence(sentence))
      }
    }
  }
}
