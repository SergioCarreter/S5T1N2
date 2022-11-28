package cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.controller;


import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.dto.FlorDTO;
import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.service.FlorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController@RequestMapping("/flor")
public class FlorController {

    // Inyeccion de dependencias de la Interface FlorService
    @Autowired
    private FlorService florService;

    // Crear nueva Flor
    @PostMapping("/add")
    public ResponseEntity<?> create(@RequestBody FlorDTO florDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(florService.guardarFlor(florDTO));
    }

    // Lee los datos de una Flor
    @GetMapping("/getOne/{id}")
    public ResponseEntity<?> read( @PathVariable Integer id ){

        FlorDTO fDTO = florService.muestraFlorPorId(id);
        ResponseEntity<?> re;

        if ( fDTO == null ){
            // devuelve respuesta con codigo 404
            re = ResponseEntity.notFound().build();
        } else {
            // crea respuesta con estado ok y el usuario en el body de la respuesta
            re = ResponseEntity.ok( fDTO );
        }
        return re;

    }

    // Update Flor
    @PutMapping("/update")
    public ResponseEntity<?> update( @RequestParam int id, @RequestBody FlorDTO newDTO ){


        FlorDTO dbDTO = florService.muestraFlorPorId(id);
        ResponseEntity<?> re;

        if ( dbDTO == null ){
            re = ResponseEntity.notFound().build();
        } else {
            dbDTO.setNombre( newDTO.getNombre() );
            dbDTO.setPais( newDTO.getPais() );
            dbDTO.setTipo( newDTO.getTipo() );
        }
        // HttpStatus.CREATED -> Devuelve codigo 201 (Creado)
        // florService.guardarFlor() salva Flor y devuelve FlorDTO

        return ResponseEntity.status( HttpStatus.CREATED).body( florService.guardarFlor(dbDTO) );

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete( @PathVariable int id ){

        FlorDTO fDTO = florService.muestraFlorPorId(id);
        ResponseEntity<?> re;

        if( fDTO == null ){
            re = ResponseEntity.notFound().build();
        } else {
            florService.eliminarFlor(id);
            re = ResponseEntity.ok().build();
        }
        return re;

    }

    //Muestra todos los usuarios
    @GetMapping("/getAll")
    public List<FlorDTO> readAll(){
        return florService.muestraFlores();
    }

}
