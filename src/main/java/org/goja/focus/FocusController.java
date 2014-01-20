package org.goja.focus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("tasks")
public class FocusController {

	@RequestMapping(value = "/go", method = RequestMethod.GET)
	public String go(Map<String, Object> map) {
		if (!map.containsKey("tasks")) {
			map.put("tasks", new ArrayList<Task>());
		}
		return "index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Map<String, Object> map, @RequestParam("task") String name) {
		List<Task> tasks = (List<Task>) map.get("tasks");
		Task task = new Task();
		task.setName(name);
		tasks.add(task);
		return "index";
	}

}
