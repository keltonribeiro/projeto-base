package br.com.globalweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.globalweb.domain.Usuario;
import br.com.globalweb.service.UsuarioServiceImpl;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioServiceImpl usuarioService;

	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Usuario> getAll() {
		List<Usuario> usuarios = null;
		return usuarios;
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Usuario getById(@PathVariable long id) {
		return usuarioService.findById(id);
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.POST, headers = "Accept=application/json")
	public void add(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void update(@RequestBody Usuario usuario) {
		usuarioService.update(usuario);
	}

	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void delete(@PathVariable("id") long id) {
		usuarioService.delete(id);
	}
	
}
