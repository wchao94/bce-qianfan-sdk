/*
 * Copyright (c) 2024 Baidu, Inc. All Rights Reserved.
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

package com.baidubce.model.embedding;

import com.baidubce.model.BaseRequest;

import java.util.List;

public class EmbeddingRequest extends BaseRequest<EmbeddingRequest> {
    /**
     * 输入文本以获取embedding
     */
    private List<String> input;

    public List<String> getInput() {
        return input;
    }

    public EmbeddingRequest setInput(List<String> input) {
        this.input = input;
        return this;
    }
}
