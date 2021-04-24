package com.example.gestioncamiones.contoller;


import com.example.gestioncamiones.model.Trabajador;
import com.example.gestioncamiones.repository.ItrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/administracion/trabajadores")
public class TrabajadorController {
     @Autowired
    ItrabajadorRepository trabajador;
  @GetMapping(value = "/list")
  public List<Trabajador> ObtenerTrabajadores(){
       return trabajador.findAll();

   }
    @PostMapping(value = "/add")
  public Trabajador AdicionarTrabajor(@Valid  @RequestBody Trabajador t){
      return  trabajador.save(t);

  }
  @GetMapping(value = "/mostarMod/{id}")
  public Trabajador MostarModificarTrabajador(@PathVariable Integer id){
      return trabajador.findById(id).get();

  }
    @PostMapping(value = "/mod")
   public  String ModificarTrabajador(@RequestBody Trabajador t) {
      Trabajador trab = trabajador.findById(t.getId()).get();
           trab.setCarnet(t.getCarnet());
           trab.setNombre(t.getNombre());
           trab.setA_experiencia(t.getA_experiencia());
           trab.setTipolicencia(t.getTipolicencia());
           trabajador.save(trab);
        return "Trabajador: "+ " "+trab.getNombre() + " "+ "modificado correctamente";

    }
}


