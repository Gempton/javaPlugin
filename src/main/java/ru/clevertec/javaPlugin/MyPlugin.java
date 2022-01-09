package ru.clevertec.javaPlugin;

import org.gradle.api.Project;
import org.gradle.api.Plugin;


public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("myTask", MyTask.class);
    }
}
