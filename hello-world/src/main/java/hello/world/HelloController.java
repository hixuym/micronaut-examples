/*
 * Copyright 2017-2019 original authors
 *
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
 *
 */

package hello.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;

import javax.validation.constraints.NotNull;

/**
 * @author Michael
 * Created at: 2019/2/17 20:57
 */
@Controller
@Validated
public class HelloController {

    @Get(uri = "hello/{name}", produces = MediaType.TEXT_PLAIN)
    public Single<String> hello(@NotNull String name) {

        return Single.just("Hello " + name + "!");
    }

}
