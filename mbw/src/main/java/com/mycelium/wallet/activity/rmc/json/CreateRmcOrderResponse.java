package com.mycelium.wallet.activity.rmc.json;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/**
 * Created by omerio on 04.07.2017.
 */

public class CreateRmcOrderResponse {
    public static class Json extends GenericJson {
        @Key
        public RmcOrderDetails.Json order;
    }
}
