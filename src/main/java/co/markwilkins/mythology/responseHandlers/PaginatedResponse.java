package co.markwilkins.mythology.responseHandlers;

import co.markwilkins.mythology.Location.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaginatedResponse {

    private Map<String, Object> meta;
    private Object payload;

    public PaginatedResponse(PayloadGetter getter, int page, int limit, int count){
        List payload = getter.get();
        this.payload = payload;


        Map<String, Object> metaData = new HashMap();
        int lastPage = (int) Math.ceil(( (double) count) / limit);
        Integer nextPage = (page + 2) > lastPage ? null : page + 2;
        metaData.put("current_page", page + 1);
        metaData.put("next_page", nextPage);
        metaData.put("total_pages",  lastPage);
        this.meta = metaData;
    }

    public Map<String, Object> getMeta() {
        return this.meta;
    }

    public Object getPayload() {
        return this.payload;
    }
}
