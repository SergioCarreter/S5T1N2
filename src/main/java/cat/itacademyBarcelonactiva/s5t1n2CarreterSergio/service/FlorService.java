package cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.service;

import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.domain.Flor;
import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.dto.FlorDTO;

import java.util.List;

// 3

public interface FlorService {

    public List<FlorDTO> muestraFlores();

    public Flor guardarFlor(FlorDTO florDTO);


    public FlorDTO muestraFlorPorId(int id);

    // public Flor actualizarFlor(FlorDTO flor);

    public void eliminarFlor(int id);

    public FlorDTO fromFlorToFlorDTO(Flor f);

    public Flor fromFlorDTOToFlor(FlorDTO fDTO);

}
