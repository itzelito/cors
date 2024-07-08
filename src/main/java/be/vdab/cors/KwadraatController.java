package be.vdab.cors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kwadraat")
@CrossOrigin
class KwadraatController {
    @GetMapping("{getal}")
    int kwadraat(@PathVariable int getal){
        return getal*getal;
    }
}
