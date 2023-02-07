declare namespace Addon {
  interface Manifest {
    name: string;
    creator: string;
    packageVersion: string;
    dependencies: ManifestDependency;
    contentType: 'ENGINE';
    minimumSimulatorVersion: string;
    manufacturer: string;
  }

  interface ManifestDependency {
    name: string;
    packageVersion: string;
  }

  interface Layout {
    contents: LayoutContent[];
  }

  interface LayoutContent {
    path: string;
    size: number;
    date: number;
  }
}
