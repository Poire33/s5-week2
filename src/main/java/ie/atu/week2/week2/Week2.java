package ie.atu.week2.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class Week2 {
    @GetMapping("/hello")
    public String message()
    {
        return "Hello";
    }
    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your Name is " + name;
    }
    @GetMapping("/search")
    public String search(@RequestParam String search1, @RequestParam(required = false) String search2)
    {
        return search1 + " " + search2;
    }

}
