package users;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController("/users")
public class UserController {
  static List<User> users = new ArrayList<>();

  @GetMapping
  public List<User> list() {
    if (users.isEmpty()) {
      users.add(new User(1, "Paul", "Williams"));
    }
    return users;
  }

  @PostMapping
  public void add(@RequestBody User user) {
    users.add(user);
  }
}
