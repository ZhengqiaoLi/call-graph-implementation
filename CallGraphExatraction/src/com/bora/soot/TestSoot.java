//package com.bora.soot;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import soot.G;
//import soot.MethodOrMethodContext;
//import soot.PackManager;
//import soot.Scene;
//import soot.SceneTransformer;
//import soot.SootClass;
//import soot.SootMethod;
//import soot.Transform;
//import soot.jimple.toolkits.callgraph.CHATransformer;
//import soot.jimple.toolkits.callgraph.CallGraph;
//import soot.jimple.toolkits.callgraph.Targets;
//
//public class TestSoot {
//
//	public static void main(String args[]) {
//	
//		try{
//		System.out.println("Syed");
//		PackManager.v().getPack("wjtp")
//				.add(new Transform("wjtp.ifds", new SceneTransformer() {
//
//					@Override
//					protected void internalTransform(String phaseName,
//							Map options) {
//						G.v().out.println("Huhaaa");
//						
//						CallGraph callGraph = Scene.v().getCallGraph();
//						//callGraph.
//						 Scene.v();
//						SootMethod src = Scene.v().getMainClass()
//						.getMethodByName("main");
//						Iterator<MethodOrMethodContext> targets = new Targets(
//								callGraph.edgesOutOf(src));
//						while (targets.hasNext()) {
//							SootMethod tgt = (SootMethod) targets.next();
//							System.out.println(src + " may call " + tgt);
//						}
//						
//					}
//
//				}));
//		soot.Main.main(args);
//		
//		}catch(Exception e){e.printStackTrace();}
//		
//	}
//
//	public static void method1(String args[]) {
//		List<String> argsList = new ArrayList<String>(Arrays.asList(args));
//		argsList.addAll(Arrays.asList(new String[] { "-w", "-main-class",
//				"com.bora.soot.TestSoot",// main-class
//		// "testers.AddressBook2"//argument classes
//				}));
//
//		PackManager.v().getPack("wjtp")
//				.add(new Transform("wjtp.myTrans", new SceneTransformer() {
//
//					@Override
//					protected void internalTransform(String phaseName,
//							Map options) {
//
//						CHATransformer.v().transform();
//						// SootClass a =
//						// Scene.v().getSootClass("testers.AddressBook2");
//
//						SootMethod src = Scene.v().getMainClass()
//								.getMethodByName("print");
//						CallGraph cg = Scene.v().getCallGraph();
//
//						Iterator<MethodOrMethodContext> targets = new Targets(
//								cg.edgesOutOf(src));
//						while (targets.hasNext()) {
//							SootMethod tgt = (SootMethod) targets.next();
//							System.out.println(src + " may call " + tgt);
//						}
//					}
//				}));
//
//		args = argsList.toArray(new String[0]);
//
//		Scene scene = Scene.v();
//		SootClass addrBook = scene
//				.loadClassAndSupport("com.bora.soot.TestSoot");
//		scene.loadNecessaryClasses();
//		addrBook.setApplicationClass();
//		SootMethod onCreate = addrBook.getMethodByName("print");
//
//		List<SootMethod> entryPoints = Arrays.asList(onCreate);
//		Scene.v().setEntryPoints(entryPoints);
//
//		soot.Main.main(args);
//
//	}
//
//	public void print(String input) {
//
//	}
//
//}


/*start here*/





package com.bora.soot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import soot.G;
import soot.MethodOrMethodContext;
import soot.PackManager;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Transform;
import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Targets;

public class TestSoot {

public static void main(String args[]) {
List<String> argsList = new ArrayList<String>(Arrays.asList(args));
argsList.addAll(Arrays.asList(new String[] { "-w", "-main-class",
"com.bora.soot.TestSoot","com.bora.soot.TestSoot","-v"}));// main-class
args = argsList.toArray(new String[0]);
try{
System.out.println("Syed");
PackManager.v().getPack("wjtp")
.add(new Transform("wjtp.ifds", new SceneTransformer() {

@Override
protected void internalTransform(String phaseName,
Map options) {
CHATransformer.v().transform();
SootClass a = Scene.v().getSootClass("com.bora.soot.Eric");
System.out.println("Syed and Ali inside :D");
CallGraph callGraph = Scene.v().getCallGraph();
Scene.v();
SootMethod src = Scene.v().getMainClass().getMethodByName("printMethod");

 Iterator<MethodOrMethodContext> targets = new Targets(
 callGraph.edgesOutOf(src));
 while (targets.hasNext()) {
SootMethod tgt = (SootMethod) targets.next();
 System.out.println(src + " may call " + tgt);
 a.setResolvingLevel(1);
}
}

}));
soot.Main.main(args);
System.out.println("Syed_Soot_out");
}catch(Exception e){e.printStackTrace();}
}

public void printMethod() {

String name="syed";
System.out.println("This is the name:"+ name);
}

// public static void method1() {
// List<String> argsList = new ArrayList<String>(Arrays.asList(args));
// argsList.addAll(Arrays.asList(new String[] { "-w", "-main-class",
// "com.bora.soot.TestSoot",// main-class
// // "testers.AddressBook2"//argument classes
// }));
//
// PackManager.v().getPack("wjtp")
// .add(new Transform("wjtp.myTrans", new SceneTransformer() {
//
// @Override
// protected void internalTransform(String phaseName,
// Map options) {
//
// CHATransformer.v().transform();
// // SootClass a =
// // Scene.v().getSootClass("testers.AddressBook2");
//
// SootMethod src = Scene.v().getMainClass()
// .getMethodByName("print");
// CallGraph cg = Scene.v().getCallGraph();
//
// Iterator<MethodOrMethodContext> targets = new Targets(
// cg.edgesOutOf(src));
// while (targets.hasNext()) {
// SootMethod tgt = (SootMethod) targets.next();
// System.out.println(src + " may call " + tgt);
// }
// }
// }));
//
// args = argsList.toArray(new String[0]);
//
// Scene scene = Scene.v();
// SootClass addrBook = scene
// .loadClassAndSupport("com.bora.soot.TestSoot");
// scene.loadNecessaryClasses();
// addrBook.setApplicationClass();
// SootMethod onCreate = addrBook.getMethodByName("print");
//
// List<SootMethod> entryPoints = Arrays.asList(onCreate);
// Scene.v().setEntryPoints(entryPoints);
//
// soot.Main.main(args);
//
// }

}








