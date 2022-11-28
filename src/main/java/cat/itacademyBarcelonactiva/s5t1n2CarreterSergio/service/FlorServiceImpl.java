package cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.service;


import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.domain.Flor;
import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.dto.FlorDTO;
import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.repository.FlorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlorServiceImpl implements FlorService{

    @Autowired
    private FlorRepository florRepository;

    @Override
    public List<FlorDTO> muestraFlores() {
        List<FlorDTO> listaDTO = new ArrayList<>();
        List<Flor> list = florRepository.findAll();

        for ( Flor f : list){
            FlorDTO fDTO = fromFlorToFlorDTO(f);
            listaDTO.add(fDTO);
        }
        return listaDTO;
    }

    @Override
    public FlorDTO guardarFlor(FlorDTO florDTO) {
        Flor flor = fromFlorDTOToFlor(florDTO);
        return fromFlorToFlorDTO( florRepository.save(flor) );
    }

    @Override
    public FlorDTO muestraFlorPorId(int id) {

        Flor f = florRepository.findById(id).get();
        FlorDTO fDTO = fromFlorToFlorDTO(f);
        return fDTO;

    }

    @Override
    public void eliminarFlor(int id) {

        florRepository.deleteById( id );

    }

    @Override
    public FlorDTO fromFlorToFlorDTO(Flor f) {
        FlorDTO fDTO = new FlorDTO();
        fDTO.setId( f.getId() );
        fDTO.setNombre( f.getNombre() );
        fDTO.setPais( f.getPais() );
        if ( FlorDTO.esUE( f.getPais() ) ) {
            fDTO.setTipo("UE");
        } else {
            fDTO.setTipo("No UE");
        }
        return fDTO;
    }

    @Override
    public Flor fromFlorDTOToFlor(FlorDTO fDTO) {
        Flor f = new Flor();
        f.setId( fDTO.getId() );
        f.setNombre( fDTO.getNombre() );
        f.setPais( fDTO.getPais() );
        return f;
    }


}
