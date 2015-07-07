//
//  GameViewController.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "GameViewController.h"

@implementation GameViewController

-(id)init{
    if(self = [super init]){
        self.gameView = [[GameView alloc]initWithFrame: [[UIScreen mainScreen]bounds]];
        self.view = self.gameView;
    }
    return self;
}

@end