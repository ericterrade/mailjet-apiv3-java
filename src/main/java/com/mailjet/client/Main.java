/*
 * Copyright (C) 2015 Mailjet Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Contactslist;

/**
 *
 * @author Guillaume Badi - Mailjet
 */
public class Main {
    public static void main(String[] args) throws MailjetException {
        MailjetClient client = new MailjetClient("4e4f93d73a19e4c61210aa2e7cddd193", "e200b7563144d92754ed7b71e06a027c");
        client.setDebug(MailjetClient.VERBOSE_DEBUG);

        MailjetRequest request = new MailjetRequest(Contactslist.resource).filter("id", 1);

        MailjetResponse response = client.delete(request);
        System.out.println(response);
    }
}

