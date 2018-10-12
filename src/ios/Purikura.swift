import Foundation
import AVFoundation

@objc(QRScanner)
class QRScanner : CDVPlugin, AVCaptureMetadataOutputObjectsDelegate {
  func execute(command: CDVInvokedUrlCommand) {
    NSLog("execute command")
  }
}