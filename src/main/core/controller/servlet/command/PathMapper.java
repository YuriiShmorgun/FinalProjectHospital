package controller.servlet.command;

import com.sun.javafx.collections.MappingChange;
import model.entity.Role;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PathMapper {

    private static Map<String, String> map = new ConcurrentHashMap();


    public static Map getPathMap(){

      /*  map.put(Role.GUEST, "");
        map.put(Role.PATIENT, "");
        map.put(Role.WRITE_OUT_PATIENT, "");
        map.put(Role.NURSE, "");
        map.put(Role.DOCTOR, "");*/
        map.put(Role.ADMINISTRATOR.toString(), "redirect:/util/administrator/administrator.jsp");


        System.out.println(map.get("ADMINISTRATOR"));

        return map;
    }

}
