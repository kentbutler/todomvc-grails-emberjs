package todo

class JSONUtil {

    static Closure optStr = {json, obj, prop ->
        if(json?.has(prop)) {
            String propVal = (json?.isNull(prop)) ? null : json?.getString(prop)?.trim()
            obj[prop] = propVal
        }
    }

    static Closure optInt = {json, obj, prop ->
        if(json?.has(prop))
            obj[prop] = (json?.isNull(prop)) ? null : json?.getInt(prop)
    }

    static Closure optBoolean = {json, obj, prop ->
        if(json?.has(prop))
            obj[prop] = (json?.isNull(prop)) ? null : json?.getBoolean(prop)
    }
    
}
