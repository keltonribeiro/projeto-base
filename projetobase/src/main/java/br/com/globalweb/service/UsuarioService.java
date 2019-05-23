package br.com.globalweb.service;

import br.com.globalweb.domain.Usuario;

public interface UsuarioService {
	void save(Usuario usuario);
	
	void update(Usuario usuario);
	
	void delete(Long id);
	
	Usuario findById(Long id);
	
}
