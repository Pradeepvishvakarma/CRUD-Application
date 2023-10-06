package io.firstcrudproject.firstcrude.HelloWord;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {

		@RequestMapping("/helloUrl")
		public String Hello() {
			return "Hey";
		}
}
