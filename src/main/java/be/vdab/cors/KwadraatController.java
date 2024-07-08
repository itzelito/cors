package be.vdab.cors;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kwadraat")
@CrossOrigin
class KwadraatController {
    @GetMapping("{getal}")
    @Operation(summary = "het kwadraat van een getal")
    int kwadraat(@PathVariable int getal){
        return getal*getal;
    }
}
