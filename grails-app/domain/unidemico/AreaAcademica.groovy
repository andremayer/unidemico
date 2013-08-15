package unidemico

class AreaAcademica {

	String nome
	static hasMany = [artigos:Artigo]
	String toString() {"${this.nome}" }
    static constraints = {
    }
}
