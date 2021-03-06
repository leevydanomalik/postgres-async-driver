/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pgasync.impl.io;

import com.github.pgasync.impl.message.Message;

import java.nio.ByteBuffer;

/**
 * Encoder writes messages to byte buffer.
 *
 * @author Antti Laisi
 */
public interface Encoder<T extends Message> {

    /**
     * @return Message class
     */
    Class<T> getMessageType();

    /**
     * @param msg Protocol message
     * @param buffer Target buffer
     */
    void write(T msg, ByteBuffer buffer);

}
