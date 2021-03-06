package br.edu.up.sistemadevenda.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.edu.up.sistemadevenda.entity.Cliente;

public class ClienteDao implements InterfaceDao<Cliente> {
	
	static List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void salvar(Cliente c) {
		EntityManager em = Conexao.
				getInstance().createEntityManager();

		//JPA 1.1
		//EntityManager em =new EntityManagerV1();
		//JPA 2.0
		//EntityManager em =new EntityManagerV2();
		
		
		em.getTransaction().begin();
		
		em.persist(c);
		
		em.getTransaction().commit();
	}

	public void excluir(Cliente c) {
		
	}
	
	public List<Cliente> listar() {
		return clientes;
	}
}
