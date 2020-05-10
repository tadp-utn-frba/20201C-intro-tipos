class Persona
  attr_accessor :nombre
  
  def initialize(name)
    self.nombre = name
  end
end

class Saludador
    
  attr_accessor :cordial
  
  def initialize(cordial = false)
    self.cordial = cordial
  end
  
  def saludar(a)
    if(cordial)   
      "Buen día estimado " + a.nombre
    else 
      "Hoooliiiiisss"
    end
  end
end
