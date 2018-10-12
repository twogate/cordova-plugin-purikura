import Foundation
import AVFoundation

@objc(PurikuraPlugin)
class PurikuraPlugin : CDVPlugin, AVCaptureMetadataOutputObjectsDelegate {
  func execute(command: CDVInvokedUrlCommand) {
    NSLog("execute command")
  }
}