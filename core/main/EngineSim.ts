export class EngineSim {
  private RUNNING = true;

  public main(args: string[]): void {
    console.log('Startup args:', args);
    while(this.RUNNING) {
      console.log('starting frame cycle');
    }
  }
}
