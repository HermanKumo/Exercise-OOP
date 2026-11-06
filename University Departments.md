```mermaid
classDiagram
direction LR

class University{

}

class Department{

}
class Lecturer{

}

  %% Relationships with multiplicity and correct arrow types
    University "1" *-- "1..*" Department : Consists of
    Department "0..*" o-- "1..*" Lecturer : Has assigned
```