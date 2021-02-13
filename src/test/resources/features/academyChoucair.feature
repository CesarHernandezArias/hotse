
  @stories
    Feature: Academy Choucair
      As a user, I want to learn how yo automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given  that brandon wants to learn automation at the academy Choucair
      | strUser     |  strPassword    |
      | 1090492782  |  Choucair2021*  |
      When he search for the course on the choucair academy platform
      | strCourse   |
      | Workshop de Automatización |
      Then he finds the course called resources
      | strCourse   |
      | Workshop de Automatización |