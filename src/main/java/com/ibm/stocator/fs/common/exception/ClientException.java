/**
 * (C) Copyright IBM Corp. 2015, 2016
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
 *
 */

package com.ibm.stocator.fs.common.exception;

public class ClientException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public ClientException(String message, Throwable t) {
    super(message, t);
  }

  public ClientException(String message) {
    super(message);
  }

  public ClientException(Throwable t) {
    super(t);
  }

  public boolean isRetryable() {
    return true;
  }
}