package com.SkolniSystem.classes;

import java.util.HashMap;
import java.util.Map;

public class ClassRoomManager {

  private   Map<String, ClassRoom> classes;

    public ClassRoomManager() {
        this.classes = new HashMap<>();
    }

    public Map<String, ClassRoom> getClasses() {
        return classes;
    }
}
