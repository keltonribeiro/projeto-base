package br.com.globalweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.globalweb.domain.Usuario;
import br.com.globalweb.repository.UsuarioRepositoryImpl;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
    @Autowired
    private UsuarioRepositoryImpl usuarioRepository;

	@Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


    
    
    
    


}
