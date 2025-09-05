package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    /*@PostMapping // Mandar informações
    @PutMapping  // Alterar informações
    @PatchMapping // Alterar informações
    @DeleteMapping // Deletar infromações*/

    @GetMapping("/boasvindas") // puxar informações
    public String boasVindas(){
        return "Essa é minha primeira mensagem nesta Rota";

    }

}
