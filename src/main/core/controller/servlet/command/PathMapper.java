package controller.servlet.command;

import com.sun.javafx.collections.MappingChange;
import model.entity.Role;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PathMapper {


    public static Map getPathMap(){
        Map<Role, String> map = new ConcurrentHashMap();

        map.put(Role.GUEST, "");
        map.put(Role.PATIENT, "");
        map.put(Role.WRITE_OUT_PATIENT, "");
        map.put(Role.NURSE, "");
        map.put(Role.DOCTOR, "");
        map.put(Role.ADMINISTRATOR, "redirect:/util/administrator/administrator.jsp");

        return map;
    }

}
