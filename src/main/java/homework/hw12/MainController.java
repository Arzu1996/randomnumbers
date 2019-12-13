package homework.hw12;

public class MainController {
  private final MainService mainService;

  public MainController() {
    this.mainService = new MainService();
  }

  public String help() {
    return mainService.menuContent();
  }
}
